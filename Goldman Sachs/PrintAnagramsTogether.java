import java.util.*;

//Que-->> https://practice.geeksforgeeks.org/problems/print-anagrams-together/1/
public class PrintAnagramsTogether {
      public List<List<String>> Anagrams(String[] string_list) {
            List<List<String>> result = new ArrayList<List<String>>();
            List<String> keyList = new ArrayList<>();
            Map<String, List<String>> map = new HashMap<>();
            for (String str : string_list) {
                  char chars[] = str.toCharArray();
                  Arrays.sort(chars);
                  String key = String.valueOf(chars);

                  List<String> strList = new ArrayList<>();
                  if (map.containsKey(key)) {
                        strList = map.get(key);
                  }
                  if (!keyList.contains(key)) {
                        keyList.add(key);
                  }
                  strList.add(str);
                  map.put(key, strList);
            }
            for (String key : keyList) {
                  result.add(map.get(key));
            }
            return result;
      }
}
