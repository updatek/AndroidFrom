package cn.pinned.form;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.TextView;


/**
 * Created by knero on 10/17/2014.
 */
public class InputElement extends BaseFormElement{

    protected Context mContext;
    protected TextView mLabel;
    protected EditText mInput;
    private int mLayoutId;

    protected InputElement(Context context){
        super(context);
    }

    protected InputElement(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    protected InputElement(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);


    }


    @Override
    public String getValue() {
        return null;
    }

    @Override
    public String getKey() {
        return null;
    }

    @Override
    public boolean checkValue() {
        return false;
    }
}
