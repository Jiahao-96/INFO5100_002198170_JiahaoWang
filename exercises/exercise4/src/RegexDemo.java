

public class RegexDemo {
    public static void main(String[] args) {
        // Positive and negative case for pattern 1: matching a phone number
        String pattern1 = "\\d{3}-\\d{3}-\\d{4}";
        String subject1a = "123-456-7890"; // positive case
        String subject1b = "abc-123-4567"; // negative case

        System.out.println("Pattern 1: matching a phone number");
        System.out.println("Subject: " + subject1a);
        System.out.println("Matches? " + subject1a.matches(pattern1));
        System.out.println("Subject: " + subject1b);
        System.out.println("Matches? " + subject1b.matches(pattern1));

        // Positive and negative case for pattern 2: matching an email address
        String pattern2 = "\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}";
        String subject2a = "example123@example.com"; // positive case
        String subject2b = "not.an.email"; // negative case

        System.out.println("Pattern 2: matching an email address");
        System.out.println("Subject: " + subject2a);
        System.out.println("Matches? " + subject2a.matches(pattern2));
        System.out.println("Subject: " + subject2b);
        System.out.println("Matches? " + subject2b.matches(pattern2));

        // Positive and negative case for pattern 3: matching a URL
        String pattern3 = "(https?://)?(www\\.)?[a-zA-Z0-9]+\\.[a-zA-Z]{2,3}(\\.[a-zA-Z]{2,3})?(/\\S*)?";
        String subject3a = "https://www.example.com/path/to/file.html"; // positive case
        String subject3b = "not.a.url"; // negative case

        System.out.println("Pattern 3: matching a URL");
        System.out.println("Subject: " + subject3a);
        System.out.println("Matches? " + subject3a.matches(pattern3));
        System.out.println("Subject: " + subject3b);
        System.out.println("Matches? " + subject3b.matches(pattern3));

        // Positive and negative case for pattern 4: matching a hexadecimal color code
        String pattern4 = "#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})";
        String subject4a = "#ABCDEF"; // positive case
        String subject4b = "#ZZZZZZ"; // negative case

        System.out.println("Pattern 4: matching a hexadecimal color code");
        System.out.println("Subject: " + subject4a);
        System.out.println("Matches? " + subject4a.matches(pattern4));
        System.out.println("Subject: " + subject4b);
        System.out.println("Matches? " + subject4b.matches(pattern4));

        // Positive and negative case for pattern 5: matching a date in YYYY-MM-DD format
        String pattern5 = "\\d{4}-\\d{2}-\\d{2}";
        String subject5a = "2023-04-28"; // positive case
        String subject5b = "04/28/2023"; // negative case

        System.out.println("Pattern 5: matching a date in YYYY-MM-DD format");
        System.out.println("Subject: " + subject5a);
    }
}