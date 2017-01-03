package com.allstate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

/**
 * Created by localadmin on 03/01/17.
 */

public class MathMethods {

    private int list[];

    public MathMethods(int[] list) {
        this.list = list;
    }

    public OptionalDouble findAverage(){
        return Arrays.stream(this.list).average();
    }

    public OptionalDouble findMedian(){
        return Arrays.stream(this.list).sorted()/ (this.list);
    }
}