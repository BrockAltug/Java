package unit02.objects.day09;

public class StringIndexOf {
    public static void main(String[] args) {
        String str1 = "SDET is the best";
//        print the given word from the string using string methods
        String searchWord = "the";
        //create a new int to find the index value of the beginning of the searchWord
        int beginningIndex = str1.indexOf(searchWord);
        //will print out the index of searchword - "the" in the sentence "SDET is the best" = 8
        System.out.println(beginningIndex);
//        int endingIndex = beginningIndex +
////        use substring to get is
//        System.out.println(str1.substring(5,7));
//        System.out.println(str1.substring(1,2));
////        use substring to get SDET
//        System.out.println(str1.substring(0,4));

    }
}
