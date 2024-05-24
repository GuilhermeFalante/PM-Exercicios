import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonUtils {

    public static Map<String, Object> fromJSON(String nomeArquivo) {
        Map<String, Object> resultMap = new HashMap<>();
        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader(nomeArquivo)) {
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            for (Object key : jsonObject.keySet()) {
                resultMap.put((String) key, jsonObject.get(key));
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return resultMap;
    }

    public static void toJSON(Map<String, Object> map, String nomeArquivo) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.putAll(map);

        try (FileWriter writer = new FileWriter(nomeArquivo)) {
            writer.write(jsonObject.toJSONString());
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
