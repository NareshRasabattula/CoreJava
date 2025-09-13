package com.durga.solutions;

import com.durga.utils.Formatter;
import com.durga.utils.Node;

import java.util.Collections;
import java.util.List;

@SuppressWarnings("all")
public class Solutions_Pack_1 {

    public static void exercise_1(List<Node> list) {
        Collections.sort(list, (a, b) -> a.getName().compareTo(b.getName()));
    }

    public static String exercise_2(Formatter formatter) {
        return formatter.format((Integer amount) -> amount, 30000);
    }

}
