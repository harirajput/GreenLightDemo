package sample.com.glp.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

public abstract class FragmentHomeBinding extends ViewDataBinding {
  @NonNull
  public final ProgressBar loading;

  @NonNull
  public final LinearLayout progressBarHome;

  @NonNull
  public final RecyclerView rvMainHome;

  protected FragmentHomeBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ProgressBar loading, LinearLayout progressBarHome,
      RecyclerView rvMainHome) {
    super(_bindingComponent, _root, _localFieldCount);
    this.loading = loading;
    this.progressBarHome = progressBarHome;
    this.rvMainHome = rvMainHome;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentHomeBinding>inflate(inflater, sample.com.glp.R.layout.fragment_home, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentHomeBinding>inflate(inflater, sample.com.glp.R.layout.fragment_home, null, false, component);
  }

  public static FragmentHomeBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentHomeBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentHomeBinding)bind(component, view, sample.com.glp.R.layout.fragment_home);
  }
}
