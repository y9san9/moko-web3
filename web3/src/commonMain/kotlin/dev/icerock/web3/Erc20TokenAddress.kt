/*
 * Copyright 2020 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

@file:Suppress("EXPERIMENTAL_FEATURE_WARNING")

package dev.icerock.web3

inline class Erc20TokenAddress(override val value: String) : EthereumAddress {
    val contract: ContractAddress
        get() = ContractAddress(value)
}