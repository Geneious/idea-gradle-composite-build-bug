package com.example;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class PluginWrapper {

    public static void run() {
        final RealMatrix matrix = new Array2DRowRealMatrix(Plugin.matrix);
        bar(matrix, 1);
    }

    public static void bar(final RealMatrix matrix, double eps) {
        MatrixUtils.checkSymmetric(matrix, eps);
    }
}
