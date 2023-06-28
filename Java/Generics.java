/*
Generic methods are a very efficient way to handle multiple datatypes using a single method.
Let's say you have an integer array and a string array.
You have to write a single method printArray that can print all the elements of both arrays. The method should be able to accept both integer arrays or string arrays.


1
2
3
Hello
World

Do not use method overloading because your answer will not be accepted.

*/


    public static void main(String[] args) {
        Integer[] intArr = { 1, 2, 3 };
        String[] strArr = { "Hello", "World" };
        printArray(intArr);
        printArray(strArr);
    }
    
        public static <T> void printArray(T[] array) {
            for (T item : array) {
                System.out.println(item);
            }
        }
        public static <T> void printList(List<T> list) {
            for (T item : list) {
                System.out.println(item);
            }
        }
