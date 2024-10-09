// Generated by view binder compiler. Do not edit!
package com.example.powerup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.powerup.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityInventorylistBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView userList;

  private ActivityInventorylistBinding(@NonNull ConstraintLayout rootView,
      @NonNull RecyclerView userList) {
    this.rootView = rootView;
    this.userList = userList;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityInventorylistBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityInventorylistBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_inventorylist, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityInventorylistBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.userList;
      RecyclerView userList = ViewBindings.findChildViewById(rootView, id);
      if (userList == null) {
        break missingId;
      }

      return new ActivityInventorylistBinding((ConstraintLayout) rootView, userList);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
