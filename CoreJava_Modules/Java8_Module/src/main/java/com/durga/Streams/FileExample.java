package com.durga.Streams;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;
import java.util.TreeSet;
import static java.util.stream.Collectors.*;

/**
 * @author Durganaresh - 10/17/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class FileExample {
    public static void main(String[] args) throws IOException {
        /*
         * For every initial word letter in the file,
         * list all the words over 7 letters that
         * begin with that letter, in alphabetical order.
         *
         * If there are no words over 7 letters beginning
         * with that letter, give an empty list for the result.
         */

		/*
		Example of the result (not accurate)

		a: [arranged, authority]
		b: [blacksmith, brothers]
		c: [character, childish, conclusion]
		d: []
		e: [entertained, exceedingly, existence]
		*/

        System.out.println(new File(".").getAbsolutePath());

        Path path = Path.of("D:\\GitRepository\\CoreJava\\CoreJava_Modules\\" +
                "Java8_Module\\src\\main\\java\\com\\durga\\Streams\\sample");

        System.out.println(path.toFile().exists());

        var lines = Files.lines(path);

        var result = lines
                .flatMap(s-> Stream.of(s.split("[^A-Za-z]+")))
                .filter(s -> s.length() > 0)
                .map(String::toLowerCase)
                .collect(
                        groupingBy(
                                s -> s.charAt(0),
                                filtering(
                                        s -> s.length() > 7,
                                        toCollection(TreeSet::new)
                                )
                        )
                );

        lines.close();

        for(var e: result.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }
}
