package interfaces;


public class TextView
{
    private TextWatcher textwatcher;

    public void addTextChangedListener(TextWatcher textwatcher)
    {
        this.textwatcher = textwatcher;

    }
}