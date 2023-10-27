## Function Works:
<sup>
In the first step, an array is created to hold the input string and separators. By default, this array contains "." and "," as separators.
<br>
Next, a StringBuilder object is created to store the transformed output efficiently. This object accumulates the result as the function processes the input string.
<br>
Then, a loop (for loop) is initiated to iterate through each character in the input string.
<br>
The loop takes each character in sequence and appends it to the StringBuilder object. However, before appending the character, a check is made to determine which separator it should be concatenated with.
<br>
An index x is used to keep track of which separator to use. Initially, this index is set to zero. The first character is combined with the first separator, which is ".". The second character is combined with the second separator, which is ",".
<br>
The index is incremented if it does not exceed the boundaries of the separator array. However, when the index goes beyond the boundaries, it is reset to zero. This ensures that the separators are applied alternately.
<br>
This process continues until the last character of the input string is processed.
<br>
As a result, the transformed string accumulates within the StringBuilder object.
<br>
Finally, the transformed string is obtained by converting the contents of the StringBuilder object to a Java string using the .toString() method, and it is returned.
</sup>
##Note:
<b>This code can be useful in scenarios where the input string needs to be transformed with specified separators.</b>
## Usage:
```java
public static void main(String[] args) {
    String inputString = "Hello";
    String result = basic_mapping(inputString);
    System.out.println("New String: " + result);
}
