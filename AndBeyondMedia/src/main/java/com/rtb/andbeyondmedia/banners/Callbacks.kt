package com.rtb.andbeyondmedia.banners

import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.admanager.AdManagerAdRequest

internal interface AdManagerListener {
    fun attachAdView(adUnitId: String, adSizes: List<AdSize>)

    fun loadAd(request: AdManagerAdRequest)
}