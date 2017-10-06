package interfaces;

public class ResidenceActivity implements interfaces.TextWatcher {

    long dateTextChanged;

    @Override
    public void afterTextChanged() {
        System.out.println("We're watching you");
    }

    public ResidenceActivity() {
        dateTextChanged = TextWatcher.beforeTextChanged();
    }

    @Override
    public void onTextChanged() {
        System.out.println("Adapt or die");
    }
}