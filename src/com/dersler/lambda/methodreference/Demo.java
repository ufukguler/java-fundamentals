package com.dersler.lambda.methodreference;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.*;

/**
 * created by: ufuk on 5.11.2020 17:45
 */
public class Demo {
    public static void main(String[] args) {
        List<String> messages = Arrays.asList("hello", "baeldung", "readers!");

        messages.forEach(s -> StringUtils.capitalize(s));
        messages.forEach(StringUtils::capitalize);

        List<Integer> numbers = Arrays.asList(5, 3, 50, 24, 40, 2, 9, 18);
        List<Integer> numbers2 = new ArrayList<>();
        numbers.stream()
                .sorted(Integer::compareTo)
                .forEach(numbers2::add);
        //Collections.sort(numbers);

        List<String> bikeBrands = Arrays.asList("Giant", "Scott", "Trek", "GT");
        Bicycle[] bcc = bikeBrands.stream()
                .map(Bicycle::new)
                .toArray(Bicycle[]::new);

        for (int i = 0; i < bcc.length; i++) {
            System.out.println(bcc[i].toString());
        }
    }

}
