public class StringCaseChanger implements StringTransformer{

    @Override
    public void execute(StringDrink drink) {
        StringBuilder casechanger = new StringBuilder(drink.getText());
        for (int i = 0; i < casechanger.length(); i++){
            if (Character.isLowerCase(casechanger.charAt(i))) casechanger.setCharAt(i,Character.toUpperCase(casechanger.charAt(i)));
            else if (Character.isUpperCase(casechanger.charAt(i))) casechanger.setCharAt(i,Character.toLowerCase(casechanger.charAt(i)));
        }
        drink.setText(casechanger.toString());
    }
}
