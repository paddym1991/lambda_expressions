/**
 * Anonymous class is replaced by a Lambda
 */
package interfaces;

public class ResidenceActivity {

    TextView textView = new TextView();

    public ResidenceActivity() {
        textView.addTextChangedListener(() -> System.out.println("Text changed"));
    }
}


/**
 * In the case below an anonymous class is used
 */

//package interfaces;
//
//public class ResidenceActivity {
//
//    TextView textView = new TextView();
//
//    public ResidenceActivity() {
//        textView.addTextChangedListener(new TextWatcher() {
//
//            @Override
//            public void afterTextChanged() {
//                System.out.println("Text changed");
//            }
//        });
//    }
//}