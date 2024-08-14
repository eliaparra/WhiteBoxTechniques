public class Decision {


    public String processInput(int number, String category) {
        String result = "";

        // Condicional IF
        if (number < 0) {
            throw new IllegalArgumentException("Number cannot be negative");
        } else if (number == 0) {
            result = "Zero";
        } else if (number < 10) {
            result = "Single digit";
        } else if (number < 100) {
            result = "Double digits";
        } else {
            result = "Large number";
        }

        // Switch CASE
        switch (category.toLowerCase()) {
            case "a":
                result += " - Category A";
                break;
            case "b":
                result += " - Category B";
                break;
            case "c":
                result += " - Category C";
                break;
            default:
                result += " - Unknown category";
                break;
        }

        return result;
    }
}
