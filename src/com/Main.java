package com;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FCA(scanner, scanner.nextLine());
    }

    private static void FCA(Scanner scanner, String input) {
        List<Character> result = new LinkedList<>();
        int i = 0;
        if (input.charAt(i) == 'D') {
            //Loop 1
            while (input.charAt(i + 1) != 'L') {
                result.add('-');
            }
            if (input.charAt(i + 1) == 'L') {
                // Loop 2
                while (input.charAt(i + 2) != 'D') {
                    result.add('-');
                }
                if (input.charAt(i + 2) == 'D') {
                    result.add('-');
                    if (input.charAt(i + 3) == 'L') {
                        result.add('0');
                        // loop 3
                        while (input.charAt(i + 4) != 'D') {
                            if (input.charAt(i + 1) == 'L') {
                                while (input.charAt(i + 2) != 'D') {
                                    result.add('-');
                                }
                                if (input.charAt(i + 2) == 'D') {
                                    result.add('-');
                                    if (input.charAt(i + 3) == 'L') {

                                        result.add('0');
                                    }
                                }
                            }
                        }
                    } else if (input.charAt(i + 4) == 'D') {
                        result.add('-');
                        if (input.charAt(i + 5) == 'L') {
                            result.add('1');
                            // Loop 4
                            while (input.charAt(i + 5) != 'D') {
                                if (input.charAt(i + 1) == 'L') {
                                    // loop 2
                                    while (input.charAt(i + 2) != 'D') {
                                        result.add('-');
                                    }
                                    if (input.charAt(i + 2) == 'D') {
                                        result.add('-');
                                        if (input.charAt(i + 3) == 'L') {
                                            result.add('0');
                                            // loop 3
                                            while (input.charAt(i + 4) != 'D') {
                                                if (input.charAt(i + 1) == 'L') {
                                                    while (input.charAt(i + 2) != 'D') {
                                                        result.add('-');
                                                    }
                                                    if (input.charAt(i + 2) == 'D') {
                                                        result.add('-');
                                                        if (input.charAt(i + 3) == 'L') {
                                                            result.add('0');
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (input.charAt(i + 4) == 'D') {
                                            result.add('-');
                                            if (input.charAt(i + 5) == 'L') {
                                                result.add('1');
                                            }
                                        }
                                    }
                                } else if (input.charAt(i + 5) == 'D') {
                                    result.add('-');
                                }
                            }
                        }
                    }
                }
            }
        }
        result.stream().forEach(System.out::print);
    }
}