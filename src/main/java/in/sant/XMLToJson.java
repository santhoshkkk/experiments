package in.sant;

import org.json.JSONObject;
import org.json.XML;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;

public class XMLToJson {

    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();

        Files.lines(Paths.get("input.xml"), StandardCharsets.UTF_8).forEach(line->sb.append(line));

        JSONObject json = XML.toJSONObject(sb.toString());
        Files.write(Paths.get("output.json"),json.toString().getBytes());
    }
}
