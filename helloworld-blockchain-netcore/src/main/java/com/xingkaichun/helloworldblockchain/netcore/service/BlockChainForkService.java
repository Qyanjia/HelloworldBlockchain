package com.xingkaichun.helloworldblockchain.netcore.service;

import com.xingkaichun.helloworldblockchain.netcore.dto.fork.BlockchainForkBlockDto;

import java.math.BigInteger;
import java.util.List;

/**
 * 区块链分叉service
 *
 * @author 邢开春 微信HelloworldBlockchain 邮箱xingkaichun@qq.com
 */
public interface BlockChainForkService {

    boolean isFork(BigInteger blockHeight, String blockHash);

    /**
     * 获取固定Hash的[小于传入的区块高度]的最大区块高度
     */
    BigInteger getFixBlockHashMaxBlockHeight(BigInteger blockHeight);

    void updateBlockchainFork(List<BlockchainForkBlockDto> blockList) ;
    void blockchainForkHandler() ;
    List<BlockchainForkBlockDto> queryBlockchainFork() ;
}
