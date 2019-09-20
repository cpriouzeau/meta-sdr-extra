SUMMARY = "itpp"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "https://freefr.dl.sourceforge.net/project/itpp/itpp/4.3.1/itpp-4.3.1.tar.bz2"
SRC_URI[md5sum] = "94f3dac6df2bb829819d0aa99b501933"
SRC_URI[sha256sum] = "50717621c5dfb5ed22f8492f8af32b17776e6e06641dfe3a3a8f82c8d353b877"

S = "${WORKDIR}/itpp-4.3.1"

inherit cmake pkgconfig

