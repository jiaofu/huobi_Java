package com.huobi.client.message.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import com.huobi.gateway.enums.SideEnum;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AggrTradeEntry {

  private String symbol;

  /**
   * The first unique trade id of this aggregate trade.
   */
  private Long firstTradeId;

  /**
   * The last unique trade id of this aggregate trade.
   */
  private Long lastTradeId;

  /**
   * The UNIX formatted timestamp generated by server in UTC.
   */
  private Long timestamp;

  /**
   * The trading price in quote currency.
   */
  private BigDecimal price;

  /**
   * The trading volume in base currency.
   */
  private BigDecimal volume;

  /**
   * The side of the taker trade: 'buy' or 'sell'.
   */
  private SideEnum side;

}
