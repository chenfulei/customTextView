package com.example.custextview.widget;

import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.method.ArrowKeyMovementMethod;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.TextView;

public class CustomTextView extends TextView{

	public CustomTextView(Context context) {
        this(context, null);
    }

    public CustomTextView(Context context, AttributeSet attrs) {
        this(context, attrs, android.R.attr.editTextStyle);
    }

    public CustomTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected boolean getDefaultEditable() {
        return true;
    }

    @Override
    protected MovementMethod getDefaultMovementMethod() {
        return ArrowKeyMovementMethod.getInstance();
    }
//
//    @Override
//    public Editable getText() {
//        return (Editable) super.getText();
//    }
//
//    @Override
//    public void setText(CharSequence text, BufferType type) {
//        super.setText(text, BufferType.EDITABLE);
//    }
//
//    /**
//     * Convenience for {@link Selection#setSelection(Spannable, int, int)}.
//     */
//    public void setSelection(int start, int stop) {
//        Selection.setSelection(getText(), start, stop);
//    }
//
//    /**
//     * Convenience for {@link Selection#setSelection(Spannable, int)}.
//     */
//    public void setSelection(int index) {
//        Selection.setSelection(getText(), index);
//    }
//
//    /**
//     * Convenience for {@link Selection#selectAll}.
//     */
//    public void selectAll() {
//        Selection.selectAll(getText());
//    }
//
//    /**
//     * Convenience for {@link Selection#extendSelection}.
//     */
//    public void extendSelection(int index) {
//        Selection.extendSelection(getText(), index);
//    }
//
//    @Override
//    public void setEllipsize(TextUtils.TruncateAt ellipsis) {
//        if (ellipsis == TextUtils.TruncateAt.MARQUEE) {
//            throw new IllegalArgumentException("EditText cannot use the ellipsize mode "
//                    + "TextUtils.TruncateAt.MARQUEE");
//        }
//        super.setEllipsize(ellipsis);
//    }
//
//    @Override
//    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
//        super.onInitializeAccessibilityEvent(event);
//        event.setClassName(EditText.class.getName());
//    }
//
//    @Override
//    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
//        super.onInitializeAccessibilityNodeInfo(info);
//        info.setClassName(EditText.class.getName());
//    }
	
}
