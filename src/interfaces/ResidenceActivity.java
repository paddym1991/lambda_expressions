package interfaces;

public class ResidenceActivity {

    TextView textView = new TextView();     //Declare and initialize a TextView field in ResidenceActivity.

    public ResidenceActivity() {

        //using an anonymous class
        textView.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged() {
                System.out.println("Text changed");

            }

        });

        //using a lambda
        textView.addTextChangedListener(() -> System.out.println("Text changed"));

    }

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