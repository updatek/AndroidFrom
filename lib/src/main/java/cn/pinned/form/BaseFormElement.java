package cn.pinned.form;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;


/**
 * Created by knero on 10/17/2014.
 */
public abstract class BaseFormElement extends LinearLayout{

    protected BaseFormElement(Context context) {
        super(context);
    }

    protected BaseFormElement(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    protected BaseFormElement(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public abstract String getValue();
    public abstract String getKey();
    public abstract boolean checkValue();
}
