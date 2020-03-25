package com.xingkaichun.helloworldblockchain.node.service;

import com.xingkaichun.helloworldblockchain.core.BlockChainCore;
import com.xingkaichun.helloworldblockchain.core.exception.BlockChainCoreException;
import com.xingkaichun.helloworldblockchain.node.dto.adminconsole.request.AddNodeRequest;
import com.xingkaichun.helloworldblockchain.node.dto.nodeserver.Node;
import com.xingkaichun.helloworldblockchain.node.dto.nodeserver.SimpleNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminConsoleServiceImpl implements AdminConsoleService {

    @Autowired
    private BlockChainCore blockChainCore;

    @Autowired
    private NodeService nodeService;


    @Override
    public boolean isMinerActive() {
        return blockChainCore.getMiner().isActive();
    }

    @Override
    public void activeMiner() throws Exception {
        blockChainCore.getMiner().active();
    }

    @Override
    public void deactiveMiner() throws Exception {
        blockChainCore.getMiner().deactive();
    }

    public boolean isSynchronizerActive() {
        return blockChainCore.getSynchronizer().isActive();
    }

    public boolean deactiveSynchronizer() {
        blockChainCore.getSynchronizer().deactive();
        return true;
    }

    public boolean activeSynchronizer() {
        blockChainCore.getSynchronizer().active();
        return true;
    }
}
