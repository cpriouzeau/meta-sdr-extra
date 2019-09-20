SUMMARY = "mbelib"
LICENSE = "BSD-0-Clause"
LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=a3d030ac24b65bf3e9b3abd218c8ba1c"

SRC_URI = "git://github.com/szechyjs/mbelib.git;protocol=https"
SRCREV = "9a04ed5c78176a9965f3d43f7aa1b1f5330e771f"

S = "${WORKDIR}/git"

inherit cmake pkgconfig

