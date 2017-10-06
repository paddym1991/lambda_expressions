package interfaces;

public class ResidenceActivity implements interfaces.TextWatcher {

    @Override
    public void afterTextChanged() {
        System.out.println("We're watching you");
    }
}