// Generated by view binder compiler. Do not edit!
package com.example.crockpot3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.example.crockpot3.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class NewRecipesPageBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView recyclerViewRecipes;

  private NewRecipesPageBinding(@NonNull ConstraintLayout rootView,
      @NonNull RecyclerView recyclerViewRecipes) {
    this.rootView = rootView;
    this.recyclerViewRecipes = recyclerViewRecipes;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static NewRecipesPageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static NewRecipesPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.new_recipes_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static NewRecipesPageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.recycler_view_recipes;
      RecyclerView recyclerViewRecipes = rootView.findViewById(id);
      if (recyclerViewRecipes == null) {
        break missingId;
      }

      return new NewRecipesPageBinding((ConstraintLayout) rootView, recyclerViewRecipes);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
