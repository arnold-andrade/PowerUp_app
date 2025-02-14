// Generated by view binder compiler. Do not edit!
package com.example.powerup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.powerup.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCustFuncBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final GridLayout gridLayout;

  @NonNull
  public final GridLayout gridLayout2;

  @NonNull
  public final TextView textView;

  @NonNull
  public final View topView;

  private ActivityCustFuncBinding(@NonNull RelativeLayout rootView, @NonNull GridLayout gridLayout,
      @NonNull GridLayout gridLayout2, @NonNull TextView textView, @NonNull View topView) {
    this.rootView = rootView;
    this.gridLayout = gridLayout;
    this.gridLayout2 = gridLayout2;
    this.textView = textView;
    this.topView = topView;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCustFuncBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCustFuncBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_cust_func, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCustFuncBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.gridLayout;
      GridLayout gridLayout = ViewBindings.findChildViewById(rootView, id);
      if (gridLayout == null) {
        break missingId;
      }

      id = R.id.gridLayout2;
      GridLayout gridLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (gridLayout2 == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.top_view;
      View topView = ViewBindings.findChildViewById(rootView, id);
      if (topView == null) {
        break missingId;
      }

      return new ActivityCustFuncBinding((RelativeLayout) rootView, gridLayout, gridLayout2,
          textView, topView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
