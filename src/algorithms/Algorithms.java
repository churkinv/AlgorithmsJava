/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Algorithms {

    /**
     * Class
     */
    public class Percolation {

        WeightedQuickUnionUF myStructure;

        public Percolation(int n) {// create n-by-n grid, with all sites blocked

        }

        public void open(int row, int col) {// open site (row, col) if it is not open already

        }

        public boolean isOpen(int row, int col) {  // is site (row, col) open?

            return true;
        }

        public boolean isFull(int row, int col) {  // is site (row, col) full?

            return true;
        }

        public int numberOfOpenSites() { // number of open sites

            return 0;
        }

        public boolean percolates() { // does the system percolate?

            return true;
        }
    }

    public class PercolationStats {

        public PercolationStats(int n, int trials) {   // perform trials independent experiments on an n-by-n grid

        }

        public double mean() { // sample mean of percolation threshold

            return 0.0;
        }

        public double stddev() {// sample standard deviation of percolation threshold

            return 0.0;
        }

        public double confidenceLo() { // low  endpoint of 95% confidence interval

            return 0.0;
        }

        public double confidenceHi() { // high endpoint of 95% confidence interval

            return 0.0;
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
}
