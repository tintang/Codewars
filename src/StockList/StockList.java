package StockList;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class StockList {

    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        var result = new StringBuilder();
        var articleCount = new LinkedHashMap<String, Integer>();

        Arrays.stream(lstOf1stLetter).forEach(category -> articleCount.put(category, 0));
        for (String article : lstOfArt) {
            var articleInformation = article.split(" ");
            var articleCategory = String.valueOf(articleInformation[0].charAt(0));
            var amount = Integer.parseInt(articleInformation[1]);
            for (var category : lstOf1stLetter) {
                if (category.equals(articleCategory)) {
                    int i = articleCount.get(category) != null ? articleCount.get(category) : 0;
                    articleCount.put(category, i + amount);
                }
            }
        }
        articleCount.forEach((key, value) -> {
            result.append(String.format(" - (%s : %s)", key, value));
        });
        return result.toString().substring(3);
    }
}
