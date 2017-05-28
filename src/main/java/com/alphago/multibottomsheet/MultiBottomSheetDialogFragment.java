package com.alphago.multibottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatDialogFragment;

/**
 * Created by fanggeek on 2017/5/29.
 */

public class MultiBottomSheetDialogFragment extends AppCompatDialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new MultiBottomSheetDialog(getContext(), getTheme());
    }
}
