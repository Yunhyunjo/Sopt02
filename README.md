# Sopt 2차 세미나 과제

✔Screenshot
---

<div>
<img src = "https://user-images.githubusercontent.com/37900920/81376409-78dd7280-913e-11ea-90e4-cde2b279c6e2.gif">
</div>

## ✔Learn

### ItemDecoration 

=> 아이템 간에 margin을 주고 싶다면 사용하면 된다. getItemOffset을 이용하여 item의 margin 조절한다.(나는 bottom만 줌)

    class InstaItemDecoration(private val size: Int) : RecyclerView.ItemDecoration() {
        override fun getItemOffsets(
            outRect: Rect,
            view: View,
            parent: RecyclerView,
            state: RecyclerView.State
        ) {
            super.getItemOffsets(outRect, view, parent, state)
            outRect.bottom = size
        }
    }

### clipToPadding 

=> 기본값은 true로 이 상태에서 top과 bottom에 padding값을 주면 padding이 전체로 들어가 스크롤을 할때도 그 padding이 적용이 되어있다. 그때 값을 false로 주고 padding을 넣어주면 스크롤시 영향을 받지 않는다.

    android:paddingTop="9dp"
    android:paddingBottom="9dp"
    android:clipToPadding="false"
