## Function Works:
<sup>
In the first step, an array is created to hold the input string and separators. By default, this array contains "." and "," as separators.

Next, a StringBuilder object is created to store the transformed output efficiently. This object accumulates the result as the function processes the input string.

Then, a loop (for loop) is initiated to iterate through each character in the input string.

The loop takes each character in sequence and appends it to the StringBuilder object. However, before appending the character, a check is made to determine which separator it should be concatenated with.

An index x is used to keep track of which separator to use. Initially, this index is set to zero. The first character is combined with the first separator, which is ".". The second character is combined with the second separator, which is ",".

The index is incremented if it does not exceed the boundaries of the separator array. However, when the index goes beyond the boundaries, it is reset to zero. This ensures that the separators are applied alternately.

This process continues until the last character of the input string is processed.

As a result, the transformed string accumulates within the StringBuilder object.

Finally, the transformed string is obtained by converting the contents of the StringBuilder object to a Java string using the .toString() method, and it is returned.
</sup>

## Usage:
```java
public static void main(String[] args) {
    String inputString = "Hello";
    String result = basic_mapping(inputString);
    System.out.println("New String: " + result);
}
