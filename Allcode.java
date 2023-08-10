//package CourseWork;
//
//public class Allcode {
//      public static void main(String[] args) {
//    // main method
//  }
//}
//// Here is all the Java code provided in the previous responses combined into a single file:
//
//// ```java
//import java.util.Arrays;
//import java.util.Random;
//import java.util.Set;
//import java.util.HashSet;
//import java.util.Queue;
//import java.util.LinkedList;
//
//// Question 1b
//class MinCoins {
//
//  public static int minCoins(int[] ratings) {
//    Arrays.sort(ratings);
//
//    int coins = 0;
//    for (int i = 0; i < ratings.length; i++) {
//      coins += i+1;
//    }
//    return coins;
//  }
//
//  public static void main(String[] args) {
//    int[] ratings = {1, 0, 2};
//    System.out.println(minCoins(ratings));
//  }
//
//}
//
//// Question 2b
//class Program {
//
//  private int k;
//  private Set<Integer> blacklist;
//  private Random rand;
//
//  public Program(int k, int[] blacklist) {
//    this.k = k;
//    this.blacklist = new HashSet<>();
//    for (int port : blacklist) {
//      this.blacklist.add(port);
//    }
//    this.rand = new Random();
//  }
//
//  public int get() {
//    int port;
//    do {
//      port = rand.nextInt(k);
//    } while (blacklist.contains(port));
//    return port;
//  }
//
//}
//
//class Main2 {
//  public static void main(String[] args) {
//    Program program = new Program(7, new int[]{2, 3, 5});
//    System.out.println(program.get());
//  }
//}
//
//// Question 4b
//class TreeNode {
//  int val;
//  TreeNode left;
//  TreeNode right;
//
//  TreeNode(int val) {
//    this.val = val;
//  }
//}
//
//class CheckBrothers {
//
//  public boolean isBrothers(TreeNode root, int x, int y) {
//
//    if (root == null) {
//      return false;
//    }
//
//    Queue<TreeNode> queue = new LinkedList<>();
//    queue.add(root);
//
//    while (!queue.isEmpty()) {
//      TreeNode curr = queue.poll();
//
//      if (curr.left != null && curr.right != null) {
//        int left = curr.left.val;
//        int right = curr.right.val;
//        if ((left == x && right == y) || (left == y && right == x)) {
//          return true;
//        }
//      }
//
//      if (curr.left != null) {
//        queue.add(curr.left);
//      }
//      if (curr.right != null) {
//        queue.add(curr.right);
//      }
//    }
//
//    return false;
//  }
//
//}
//
//// Question 6 - Parallel merge sort
//public class ParallelMergeSort {
//
//  public static void parallelMergeSort(int[] array, int numThreads) {
//
//    // implementation
//
//  }
//
//  public static void mergeSort(int[] array, int len) {
//    // implementation
//  }
//
//  public static void merge(int[] arr, int[] l, int[] r, int left, int right) {
//    // implementation
//  }
//
//}
//
//
//
