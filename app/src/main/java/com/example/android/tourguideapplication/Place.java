package com.example.android.tourguideapplication;

/*
+ * Copyright (C) 2016 The Android Open Source Project
+ *
+ * Licensed under the Apache License, Version 2.0 (the "License");
+ * you may not use this file except in compliance with the License.
+ * You may obtain a copy of the License at
+ *
+ *      http://www.apache.org/licenses/LICENSE-2.0
+ *
+ * Unless required by applicable law or agreed to in writing, software
+ * distributed under the License is distributed on an "AS IS" BASIS,
+ * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
+ * See the License for the specific language governing permissions and
+ * limitations under the License.
+ */

/**
 + * {@link Place} represents a Place that the user wants to learn about or go to.
 + * It contains the name, address, and image for that Place.
 + */
class Place {

    /*Name of the Place*/
    private final String mPlaceName;

    /*Address for the Place*/
    private final String mPlaceAddress;

    //Drawable resource ID
    private int mImageResourceId;

    /**
     * static and final are access modifiers, can never change values aka constant
     * Constant value that represents no image was provided for this Place
     */

    private static final int NO_IMAGE_PROVIDED = -1;


    /**
     * Create a new Place object
     * @param placeName is the name of the place
     * @param placeAddress is the address of the place
     * @param imageResourceId is the drawable resource ID for the image associated with the Place
     */

    public Place(String placeName, String placeAddress, int imageResourceId) {
        mPlaceName = placeName;
        mPlaceAddress = placeAddress;
        mImageResourceId = imageResourceId;
    }


    /**
     * Get the name of the Place.
     */
    public String getPlaceName() {
        return mPlaceName;
    }

    /**
     * Get the address of the Place.
     */
    public String getPlaceAddress() {
        return mPlaceAddress;
    }

    /**
     * Get the image resource ID of the Place.
     */

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
