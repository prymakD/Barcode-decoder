# Barcode-decoder

Instructions
------------

There's a barcode "format" called binary barcode. (For some reference and examples visit [the article on barcodes on wikipedia](https://en.wikipedia.org/wiki/Barcode)). It's very simple since there are only two bar widths.

Let's not focus on any particular barcode format (like Code 11, Code-25, ITF-6, etc.) but instead let's assume the data encoding is as follows. A sequence of LD encodes a binary 0, and a LDD sequence encodes a binary 1, where "L" means a light colored bar (white) and "D" means a dark colored bar (black).

Your task to design a finite-state automaton that decodes sensor information.

Example

Input: LLLLLLLLLDLDDLDLDLLLLLLLLL

Output: ----------0--1-0-0--------

The symbol "-" means that the FSA is unable to identify and 0's or 1's at the moment.

Input: LLLLDLDDLDLDLLLLLDDDDDLLLL

Output: -----0--1-0-0-------------

Note that a 0 or 1 appears only in case where a proper sequence is "terminated" with a L bar following it.

The LDDDDD sequence doesn't encode anything - it's just an erroneous sensor read.

Additional requirements

1.  First design your FSA. (Draw it). Only then proceed with the implementation.
2.  The FSA design should greatly influence the code structure.

3.  Use as little operating memory as possible. (You should be able to complete the task just by using few conditional statements with some simple comparisons).


4.  You're not allowed to store the entire input sequence, nor are you allowed to store and analyse more than a single sensor read.

5.  Keep your code as simple as possible. (It's intended to be transcoded into electrical components).
6.  Read input from stdin until it ends. (There will be no newlines. Just a sequence that may contain more than a single barcode. Just think of it as reads from a sensor placed right next to running conveyor belt).

7.  Output to stdout. (There should be a single character outputed (-,0,1) per each character from stdin. Avoid output buffering if possible).
8.  Don't worry about the starting and ending conditions. (There will always be some padding with L's).
9.  Don't worry about the code being not compact or aesthetically pleasing. (The processor doesn't care. The compiler probably appreciates it. And a micro controller has way more code storage than RAM).


### Explanation: 

Starting with the problems, the main one is that I don't know how to implement processingthe input all at once using only conditional statements and decode light dark sequence inrespect to the whole sequence. The iterative approach was used in my solution. The ideawas to devide proccesing of LD sequence into 4 main Loops of procces, and it's hard toprocces one sensor in a time and remember what was before in the sequence.What was done to improve memory usage and

- Why I chose Linked list?

The least memory-consumpting collection for storing the decoded code in java whichwas found by me was Linked list, based on this(link to the article) comparison Linkedlist is faster in adding elements even consuming more memory, and we need thedecoded LD and LDD to be added to this collection as fast as we can.

- Is java right choice for this task and what are the limitations?

the main limitation that Java has “ everything as an object” ideology which meansthat objects will take more memory to be stored than the usual primitive data typesYes, there are still int and char which are primitives but putting them into thecollection in java means that it will be an object as java stores only reference typevalues in the collections(another restriction)Link on the articleBetter choice for this task would be C++ in my opinion as it works as it’s faster thanpython( because python is interpreted) and faster than Java( even java is compiledas C++ it uses JVM as a middle party to process code to the machine one whichmakes it slower
## FCA scheme
![FCA scheme](https://user-images.githubusercontent.com/54550596/214829224-45c08f7b-e036-41e1-9d8b-15bec2c2e4be.png)
