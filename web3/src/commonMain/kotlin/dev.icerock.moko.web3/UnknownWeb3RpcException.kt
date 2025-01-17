/*
 * Copyright 2020 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

package dev.icerock.moko.web3

import dev.icerock.moko.web3.entity.InfuraRequest

data class UnknownWeb3RpcException(
    val request: InfuraRequest<*>,
    val response: String
) : Exception("request $request return invalid response $response")
