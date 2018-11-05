package com.example;

import org.apache.commons.math3.linear.AnyMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class Connector {

    public static void run() {
        final RealMatrix matrix = new Array2DRowRealMatrix(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        foo(matrix, 1);
    }

    public static void foo(final AnyMatrix matrix, int row) {
        MatrixUtils.checkRowIndex(matrix, row);
    }
}
