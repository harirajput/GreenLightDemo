package sample.com.glp.ui.util

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.annotation.IdRes
import android.support.annotation.NonNull
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import sample.com.glp.data.model.ListModel


abstract class DataBindingViewHolder<T>

( val dataBinding: ViewDataBinding)

    : RecyclerView.ViewHolder(dataBinding.root) {

     constructor(@NonNull inflater: LayoutInflater, @IdRes layoutId: Int,
                @NonNull parent: ViewGroup, @NonNull attachToParent: Boolean) :
             this(DataBindingUtil.inflate<ViewDataBinding>(inflater, layoutId, parent, attachToParent))


    abstract fun onBind(t: ListModel)
}

