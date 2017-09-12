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

package com.acadiasoft.simm.model.risk;

import java.math.BigDecimal;

/**
 * As defined in Appendix 1 section K of doc/ISDA_SIMM_vR1.0_(PUBLIC).pdf
 */
public class RiskClassCorrelation {

  private static final BigDecimal[][] CORRELATIONS =
    {
      {BigDecimal.ONE, new BigDecimal("0.28"), new BigDecimal("0.14"), new BigDecimal("0.18"), new BigDecimal("0.30"), new BigDecimal("0.17")}, //
      {new BigDecimal("0.28"), BigDecimal.ONE, new BigDecimal("0.58"), new BigDecimal("0.66"), new BigDecimal("0.46"), new BigDecimal("0.27")}, //
      {new BigDecimal("0.14"), new BigDecimal("0.58"), BigDecimal.ONE, new BigDecimal("0.42"), new BigDecimal("0.27"), new BigDecimal("0.14")}, //
      {new BigDecimal("0.18"), new BigDecimal("0.66"), new BigDecimal("0.42"), BigDecimal.ONE, new BigDecimal("0.39"), new BigDecimal("0.24")}, //
      {new BigDecimal("0.30"), new BigDecimal("0.46"), new BigDecimal("0.27"), new BigDecimal("0.39"), BigDecimal.ONE, new BigDecimal("0.32")}, //
      {new BigDecimal("0.17"), new BigDecimal("0.27"), new BigDecimal("0.14"), new BigDecimal("0.24"), new BigDecimal("0.32"), BigDecimal.ONE} //
    };

  public static BigDecimal get(RiskClass riskClass, RiskClass riskClass2) {
    return CORRELATIONS[RiskClass.indexOf(riskClass)][RiskClass.indexOf(riskClass2)];
  }
}
