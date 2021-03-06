/*
 * Copyright HomeAway, Inc 2005-2015. All Rights Reserved.
 * No unauthorized use of this software.
 */

import org.junit.Test;

/**
 * jrussom has not yet bothered to enter a useful javadoc comment.
 */
public class UFTest {

    @Test
    public void test() {
        QuickFindUF qf = new QuickFindUF(10);
        String ops = "4-8 3-7 7-4 7-5 3-9 0-2";
        for (String union : ops.split(" ")) {
            String[] args = union.split("-");
            qf.union(Integer.valueOf(args[0]), Integer.valueOf(args[1]));
        }
        System.out.println(qf.toString());
    }

    @Test
    public void weightedQU() {
        WeightedQuickUnionUF qf = new WeightedQuickUnionUF(10);
        String ops = "2-8 6-4 4-1 0-7 4-9 9-5 8-0 4-3 3-8";
        for (String union : ops.split(" ")) {
            String[] args = union.split("-");
            qf.union(Integer.valueOf(args[0]), Integer.valueOf(args[1]));
        }
        System.out.println(qf.toString());
    }
}
