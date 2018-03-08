/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.support.design.widget;

import com.example.android.support.design.R;
import com.example.android.support.design.Shakespeare;

import android.os.Bundle;
import androidx.annotation.Nullable;
import android.text.TextUtils;
import android.widget.TextView;

public class BottomSheetScrollView extends BottomSheetUsageBase {

    @Override
    protected int getLayoutId() {
        return R.layout.design_bottom_sheet_scroll;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((TextView) findViewById(R.id.dialogue_background))
                .setText(TextUtils.concat(Shakespeare.DIALOGUE));
    }

}
