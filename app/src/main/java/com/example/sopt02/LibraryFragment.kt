package com.example.sopt02


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_library.*

class LibraryFragment : Fragment() {

    lateinit var  webtoonAdapter: WebtoonAdapter
    val datas = mutableListOf<WebtoonData>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_library, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        webtoonAdapter = WebtoonAdapter(view.context)
        rv_home.adapter = webtoonAdapter
        rv_home.addItemDecoration(InstaItemDecoration(50))
        loadDatas()
    }
    private fun loadDatas(){
        datas.apply{
            add(
                WebtoonData(
                    title = "여주 실격!",
                    img_webtoon = "https://pbs.twimg.com/profile_images/1222586471544049665/aofsNKTg_400x400.jpg"
                ))
            add(
                WebtoonData(
                    title = "오늘도 사랑스럽개",
                    img_webtoon = "https://i.pinimg.com/236x/1f/51/a0/1f51a053beb6b8db7878c0e968705b19.jpg"
                ))
            add(
                WebtoonData(
                    title = "스피릿 핑거스",
                    img_webtoon = "https://lh3.googleusercontent.com/proxy/8BVxxHmXEBnSIUpty6f_lmmuhGdIGP_8r6iTlCn7oOLPfGMF_p5x4H5QRu9OdJgtNSmKsr-xaXY-lf8lG5YvUoTDHsnoQLRIt-MihuQgD_Pk5_hyKneLXB5b-h4HCKQDIOT-9w"
                ))
            add(
                WebtoonData(
                    title = "언터처블",
                    img_webtoon = "https://lh3.googleusercontent.com/proxy/3eTRly35pxuBQK8viSCjgr0B9RSmOTSJt1OkeaME3ai6hnWCL0Vyd-FSKmMQFoYEXjpRt5Qbou3uDYobvOEhU5waSrUpm3CnP9XQ1NwUvCwASiCMFiROn9lJu-4T-1pyufmibF6i4hjVBTD4fJ291UGJsoKPEaN2gM2Rtlo26hXdPwYfN-QcYE5amGQsysVpFmxbQ5hjyDP17U3UGPw4sGEzINAdDt3t4GI4YHiipqQ3oluDCNEwFBhwOQ"
                ))
            add(
                WebtoonData(
                    title = "SM 플레이어",
                    img_webtoon = "https://lh3.googleusercontent.com/proxy/xJ2yYnX6B4uTf0wsrKD_m32iCN-tjnJijnxHMmFsopwDbX8WY0Ka2lmJd7JBewdHajrvIsx1gqklYhU58kfWvN8u3PKx05IuX7_sF1V8HzLc7ioHV_SMCr_TXrT1rX4xYi_d48w"
                ))
            add(
                WebtoonData(
                    title = "가타부타타",
                    img_webtoon = "https://pbs.twimg.com/profile_images/1081896570939793408/h8oR2apT.jpg"
                ))
            add(
                WebtoonData(
                    title = "내 ID는 강남미인",
                    img_webtoon = "https://lh3.googleusercontent.com/proxy/hrn3AA05hOBSGlM2aFnxg4iUV7LhCixG0ntqDIFkaEjaXkRjitk2pF0fT0c0gpyWuEtLQ9fT5depIaYB96jzA0tj7qNLjR4rdKK3tV_c2jh80s8t0LVESDQRqjKYZDAHnAq-0Ow"
                ))
            add(
                WebtoonData(
                    title = "오 주예수여",
                    img_webtoon = "https://wiizmkrstorage.blob.core.windows.net/webtoonthumbnail/wi_130782571945123881.jpeg"
                ))
            add(
                WebtoonData(
                    title = "프린스의 왕자",
                    img_webtoon = "https://image.mycelebs.com/cartoon/new/sq/162050_sq_1466044491.jpg"
                ))
        }
        webtoonAdapter.datas = datas
        webtoonAdapter.notifyDataSetChanged()
    }

}
