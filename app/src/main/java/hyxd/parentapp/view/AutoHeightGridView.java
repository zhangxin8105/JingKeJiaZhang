package hyxd.parentapp.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

public class AutoHeightGridView extends GridView {
	public AutoHeightGridView(Context context) {
		super(context);
	}

	public AutoHeightGridView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public AutoHeightGridView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
//		int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
//		super.onMeasure(widthMeasureSpec, expandSpec);
		int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
		super.onMeasure(widthMeasureSpec, expandSpec);
	}


}
