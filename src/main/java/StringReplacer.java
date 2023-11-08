public class StringReplacer implements StringTransformer {
    private char original;

    private char replacement;

    public StringReplacer(char original, char replacement) {
        this.original = original;
        this.replacement = replacement;
    }

    @Override
    public void execute(StringDrink drink) {
        String replace = drink.getText();
        String n = replace.replace(original, replacement);
        drink.setText(n);
    }
}
