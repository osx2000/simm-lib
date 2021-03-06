/*
 * Copyright (c) 2017 AcadiaSoft, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.acadiasoft.simm.model.fx;

import com.acadiasoft.simm.model.sensitivity.Sensitivity;

import java.math.BigDecimal;

/**
 * As defined in Appendix 1 section I of doc/ISDA_SIMM_vR1.0_(PUBLIC).pdf
 */
public class FXRiskWeightV1_3_38 implements FXRiskWeight {

  private static final BigDecimal ALL = new BigDecimal("8.0");
  private static final BigDecimal VEGA = new BigDecimal("0.32");
  private final static BigDecimal HVR = new BigDecimal("0.61");

  @Override
  public BigDecimal getRiskWeight(Sensitivity s) {
    // only one bucket for all currencies in FX com.acadiasoft.simm.model.risk class
    return ALL;
  }

  @Override
  public BigDecimal getVegaRiskWeight(Sensitivity s) {
    return VEGA;
  }

  @Override
  public BigDecimal getHVR() {
    return HVR;
  }


}
