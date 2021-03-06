/*
 * Copyright 2017 Thomson Reuters
 *
 * DISCLAIMER: This source code has been written by Thomson Reuters for the only 
 * purpose of illustrating articles published on the Thomson Reuters Developer 
 * Community. It has not been tested for usage in production environments. 
 * Thomson Reuters cannot be held responsible for any issues that may happen if 
 * these objects or the related source code is used in production or any other 
 * client environment.
 *
 * Thomson Reuters Developer Community: https://developers.thomsonreuters.com
 *
 */
package com.thomsonreuters.platformservices.elektron.objects.chain;

import com.thomsonreuters.ema.access.OmmConsumer;
import com.thomsonreuters.platformservices.elektron.objects.chain.FlatChain.OnCompleteFunction;
import com.thomsonreuters.platformservices.elektron.objects.chain.FlatChain.OnErrorFunction;
import com.thomsonreuters.platformservices.elektron.objects.chain.FlatChain.OnElementAddedFunction;
import com.thomsonreuters.platformservices.elektron.objects.chain.FlatChain.OnElementChangedFunction;
import com.thomsonreuters.platformservices.elektron.objects.chain.FlatChain.OnElementRemovedFunction;

interface ChainRecordContext
{
    OmmConsumer getOmmConsumer();
            
    String getName();
    
    String getServiceName();
    
    boolean getWithUpdates();
    
    SummaryLinksToSkipByDisplayTemplate getSummaryLinksToSkipByDisplayTemplate();
    
    int getNameGuessesCount();

    OnElementAddedFunction getOnElementAddedFunction();
    
    OnElementChangedFunction getOnElementChangedFunction();
    
    OnElementRemovedFunction getOnElementRemovedFunction();
    
    OnCompleteFunction getOnCompleteFunction();
    
    OnErrorFunction getOnErrorFunction();
    
}
