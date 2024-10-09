// Generated by view binder compiler. Do not edit!
package com.example.powerup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.powerup.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityTrainerViewprofileBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final TextView textViewDegree;

  @NonNull
  public final TextView textViewDegreeLabel;

  @NonNull
  public final TextView textViewJoiningDate;

  @NonNull
  public final TextView textViewJoiningDateLabel;

  @NonNull
  public final TextView textViewSpeciality;

  @NonNull
  public final TextView textViewSpecialityLabel;

  @NonNull
  public final TextView textViewTrainerName;

  @NonNull
  public final TextView textViewTrainerNameLabel;

  private ActivityTrainerViewprofileBinding(@NonNull RelativeLayout rootView,
      @NonNull CardView cardView, @NonNull TextView textViewDegree,
      @NonNull TextView textViewDegreeLabel, @NonNull TextView textViewJoiningDate,
      @NonNull TextView textViewJoiningDateLabel, @NonNull TextView textViewSpeciality,
      @NonNull TextView textViewSpecialityLabel, @NonNull TextView textViewTrainerName,
      @NonNull TextView textViewTrainerNameLabel) {
    this.rootView = rootView;
    this.cardView = cardView;
    this.textViewDegree = textViewDegree;
    this.textViewDegreeLabel = textViewDegreeLabel;
    this.textViewJoiningDate = textViewJoiningDate;
    this.textViewJoiningDateLabel = textViewJoiningDateLabel;
    this.textViewSpeciality = textViewSpeciality;
    this.textViewSpecialityLabel = textViewSpecialityLabel;
    this.textViewTrainerName = textViewTrainerName;
    this.textViewTrainerNameLabel = textViewTrainerNameLabel;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityTrainerViewprofileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityTrainerViewprofileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_trainer_viewprofile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityTrainerViewprofileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardView;
      CardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.textViewDegree;
      TextView textViewDegree = ViewBindings.findChildViewById(rootView, id);
      if (textViewDegree == null) {
        break missingId;
      }

      id = R.id.textViewDegreeLabel;
      TextView textViewDegreeLabel = ViewBindings.findChildViewById(rootView, id);
      if (textViewDegreeLabel == null) {
        break missingId;
      }

      id = R.id.textViewJoiningDate;
      TextView textViewJoiningDate = ViewBindings.findChildViewById(rootView, id);
      if (textViewJoiningDate == null) {
        break missingId;
      }

      id = R.id.textViewJoiningDateLabel;
      TextView textViewJoiningDateLabel = ViewBindings.findChildViewById(rootView, id);
      if (textViewJoiningDateLabel == null) {
        break missingId;
      }

      id = R.id.textViewSpeciality;
      TextView textViewSpeciality = ViewBindings.findChildViewById(rootView, id);
      if (textViewSpeciality == null) {
        break missingId;
      }

      id = R.id.textViewSpecialityLabel;
      TextView textViewSpecialityLabel = ViewBindings.findChildViewById(rootView, id);
      if (textViewSpecialityLabel == null) {
        break missingId;
      }

      id = R.id.textViewTrainerName;
      TextView textViewTrainerName = ViewBindings.findChildViewById(rootView, id);
      if (textViewTrainerName == null) {
        break missingId;
      }

      id = R.id.textViewTrainerNameLabel;
      TextView textViewTrainerNameLabel = ViewBindings.findChildViewById(rootView, id);
      if (textViewTrainerNameLabel == null) {
        break missingId;
      }

      return new ActivityTrainerViewprofileBinding((RelativeLayout) rootView, cardView,
          textViewDegree, textViewDegreeLabel, textViewJoiningDate, textViewJoiningDateLabel,
          textViewSpeciality, textViewSpecialityLabel, textViewTrainerName,
          textViewTrainerNameLabel);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
