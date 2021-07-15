package com.example.layout_again.databinding;
import com.example.layout_again.R;
import com.example.layout_again.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cardView3, 1);
        sViewsWithIds.put(R.id.cardView2, 2);
        sViewsWithIds.put(R.id.constraintLayout, 3);
        sViewsWithIds.put(R.id.textView2, 4);
        sViewsWithIds.put(R.id.cardView_note, 5);
        sViewsWithIds.put(R.id.btn_note, 6);
        sViewsWithIds.put(R.id.cardView_plus, 7);
        sViewsWithIds.put(R.id.btn_plus, 8);
        sViewsWithIds.put(R.id.cardView_mista, 9);
        sViewsWithIds.put(R.id.btn_mista, 10);
        sViewsWithIds.put(R.id.cardView_startovacky, 11);
        sViewsWithIds.put(R.id.btn_startovacky, 12);
        sViewsWithIds.put(R.id.cardView, 13);
        sViewsWithIds.put(R.id.cardView_abc, 14);
        sViewsWithIds.put(R.id.btn_abc, 15);
        sViewsWithIds.put(R.id.cardView_nejblize, 16);
        sViewsWithIds.put(R.id.btn_nejblize, 17);
        sViewsWithIds.put(R.id.cardView_zeme, 18);
        sViewsWithIds.put(R.id.btn_zeme, 19);
        sViewsWithIds.put(R.id.cardView_letovo, 20);
        sViewsWithIds.put(R.id.btn_letovo, 21);
        sViewsWithIds.put(R.id.textView, 22);
        sViewsWithIds.put(R.id.txt_itemCountItem, 23);
        sViewsWithIds.put(R.id.recycler_view, 24);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 25, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[15]
            , (android.widget.Button) bindings[21]
            , (android.widget.Button) bindings[10]
            , (android.widget.Button) bindings[17]
            , (android.widget.ImageButton) bindings[6]
            , (android.widget.ImageButton) bindings[8]
            , (android.widget.Button) bindings[12]
            , (android.widget.Button) bindings[19]
            , (androidx.cardview.widget.CardView) bindings[13]
            , (androidx.cardview.widget.CardView) bindings[2]
            , (androidx.cardview.widget.CardView) bindings[1]
            , (androidx.cardview.widget.CardView) bindings[14]
            , (androidx.cardview.widget.CardView) bindings[20]
            , (androidx.cardview.widget.CardView) bindings[9]
            , (androidx.cardview.widget.CardView) bindings[16]
            , (androidx.cardview.widget.CardView) bindings[5]
            , (androidx.cardview.widget.CardView) bindings[7]
            , (androidx.cardview.widget.CardView) bindings[11]
            , (androidx.cardview.widget.CardView) bindings[18]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[24]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[23]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}